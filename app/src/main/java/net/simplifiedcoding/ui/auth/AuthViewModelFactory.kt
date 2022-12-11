package net.simplifiedcoding.ui.auth

class AuthViewModelFactory : Factory<AuthViewModel> {
    override fun create(): AuthViewModel {
        return AuthViewModel()
    }

}