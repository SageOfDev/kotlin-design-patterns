package behavioral.state

interface AbstractState {
    fun transitionA(): Result<State> = Result.failure(IllegalStateException("Cannot transitionA when state is ${this::class.simpleName}"))
    fun transitionB(): Result<State> = Result.failure(IllegalStateException("Cannot transitionB when state is ${this::class.simpleName}"))
}

enum class State: AbstractState {
    A {
        override fun transitionA() = Result.success(B)
    },
    B {
        override fun transitionA() = Result.success(A)
    }
}