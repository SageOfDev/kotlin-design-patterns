package behavioral.state

class Context {
    var status: AbstractState = State.A
        private set

    fun transitionA() = status.transitionA().fold(
        onFailure = { throw it },
        onSuccess = { status = it }
    )

    fun transitionB() = status.transitionB().fold(
        onFailure = { throw it },
        onSuccess = { status = it }
    )

}