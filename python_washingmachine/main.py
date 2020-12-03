from __future__ import annotations
from subsystems import *
from facade import WashingMachine


def client_code(facade: WashingMachine) -> None:
    """
    The client code works with complex subsystems through a simple interface
    provided by the Facade. When a facade manages the lifecycle of the
    subsystem, the client might not even know about the existence of the
    subsystem. This approach lets you keep the complexity under control.
    """

    print(facade.operation(), end="")


if __name__ == "__main__":
    # The client code may have some of the subsystem's objects already created.
    # In this case, it might be worthwhile to initialize the Facade with these
    # objects instead of letting the Facade create new instances.
    washing = washing.Washing()
    spinning = spinning.Spinning()
    rinsing = rinsing.Rinsing()

    facade = WashingMachine(washing, spinning, rinsing)
    client_code(facade)
