//package com.example.API_School.security;
//
//import com.example.API_School.coordinator.entity.Coordinator;
//import com.example.API_School.student.entity.Student;
//import com.example.API_School.teacher.entity.Teacher;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//
//@RequiredArgsConstructor
//@Component
//public class UserAuthenticationFilter extends OncePerRequestFilter {
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//            throws ServletException, IOException {
//        if (checkIfEndpointIsNotPublic(request)) {
//            String token = recoveryToken(request);
//            if (token != null) {
//                String subject = jwtTokenService.getSubjectFromToken(token);
//
//                Authentication authentication = null;
//
//                Teacher teacher = teacherRepository.findByEmail(subject);
//                if (teacher != null) {
//                    UserDetailsImpl userDetails = new UserDetailsImpl(teacher);
//                    authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//                } else {
//                    Student student = studentRepository.findByEmail(subject);
//                    if (student != null) {
//                        UserDetailsImpl userDetails = new UserDetailsImpl(student);
//                        authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//                    } else {
//                        Coordinator coordinator = coordinatorRepository.findByEmail(subject);
//                        if (coordinator != null) {
//                            UserDetailsImpl userDetails = new UserDetailsImpl(coordinator);
//                            authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//                        }
//                    }
//                }
//
//                if (authentication != null) {
//                    SecurityContextHolder.getContext().setAuthentication(authentication);
//                } else {
//                    throw new RuntimeException("O usuário não foi encontrado.");
//                }
//            } else {
//                throw new RuntimeException("O token está ausente.");
//            }
//        }
//        filterChain.doFilter(request, response);
//    }
//
//    private String recoveryToken(HttpServletRequest request) {
//        String authorizationHeader = request.getHeader("Authorization");
//        if (authorizationHeader != null) {
//            return authorizationHeader.replace("Bearer ", "");
//        }
//        return null;
//    }
//
//    private boolean checkIfEndpointIsNotPublic(HttpServletRequest request) {
//        String requestURI = request.getRequestURI();
//        String method = request.getMethod();
//
//        if ("GET".equalsIgnoreCase(method)) {
//            return !matchesAnyPattern(requestURI, SecurityConfiguration.GET_ENDPOINTS_WITH_AUTHENTICATION_NOT_REQUIRED);
//        } else if ("POST".equalsIgnoreCase(method)) {
//            return !matchesAnyPattern(requestURI, SecurityConfiguration.POST_ENDPOINTS_WITH_AUTHENTICATION_NOT_REQUIRED);
//        }
//
//        return true;
//    }
//
//    private boolean matchesAnyPattern(String uri, String[] patterns) {
//        for (String pattern : patterns) {
//            if (Pattern.matches(pattern.replace("*", ".*"), uri)) {
//                return true;
//            }
//        }
//        return false;
//    }
//}
