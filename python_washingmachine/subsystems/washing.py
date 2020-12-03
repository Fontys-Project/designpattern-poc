from __future__ import annotations


class Washing:
    """
    The Subsystem can accept requests either from the facade or client directly.
    In any case, to the Subsystem, the Facade is yet another client, and it's
    not a part of the Subsystem.
    """

    def wash(self) -> str:
        return "Wash machine: washing!"
