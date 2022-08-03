package run.halo.app.core.extension.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import run.halo.app.core.extension.Role;
import run.halo.app.core.extension.User;

public interface UserService {

    Mono<User> getUser(String username);

    @Deprecated
    Mono<Void> updatePassword(String username, String newPassword);

    Mono<User> updateWithRawPassword(String username, String rawPassword);

    Flux<Role> listRoles(String username);
}