from __future__ import annotations
from subsystems import *


class WashingMachine:
    """
    The Facade class provides a simple interface to the complex logic of one or
    several subsystems. The Facade delegates the client requests to the
    appropriate objects within the subsystem. The Facade is also responsible for
    managing their lifecycle. All of this shields the client from the undesired
    complexity of the subsystem.
    """

    def __init__(self, washing: Washing, spinning: Spinning, rinsing: Rinsing) -> None:
        """
        Depending on your application's needs, you can provide the Facade with
        existing subsystem objects or force the Facade to create them on its
        own.
        """

        self._washing = washing or Washing()
        self._spinning = spinning or Spinning()
        self._rinsing = rinsing or Rinsing()

    def operation(self) -> str:
        """
        The Facade's methods are convenient shortcuts to the sophisticated
        functionality of the subsystems. However, clients get only to a fraction
        of a subsystem's capabilities.
        """

        results = []
        results.append("Facade initializes subsystems:")
        results.append(self._washing.wash())
        results.append(self._spinning.spin())
        results.append(self._rinsing.rinse())

        return "\n".join(results)
