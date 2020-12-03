class _IgnitionSystem(object):

    @staticmethod
    def produce_spark():
        return True


class _Engine(object):

    def __init__(self):
        self.revs_per_minute = 0

    def turnon(self):
        self.revs_per_minute = 2000

    def turnoff(self):
        self.revs_per_minute = 0


class _FuelTank(object):
    def __init__(self, level=30):
        self._level = level

    @property
    def level(self):
        return self._level

    @level.setter
    def level(self, level):
        self._level = level


class _DashBoardLight(object):

    def __init__(self, is_on=False):
        self._is_on = is_on

    def __str__(self):
        return self.__class__.__name__

    @property
    def is_on(self):
        return self._is_on

    @is_on.setter
    def is_on(self, status):
        self._is_on = status

    def status_check(self):
        if self._is_on:
            print('{}: ON'.format(str(self)))
        else:
            print('{}: OFF'.format(str(self)))


class _HandBrakeLight(_DashBoardLight):
    pass


class _FogLampLight(_DashBoardLight):
    pass


class _Dashboard(object):

    def __init__(self):
        self.lights = {'handbreak': _HandBrakeLight(), 'fog': _FogLampLight()}

    def show(self):
        for light in self.lights.values():
            light.status_check()
