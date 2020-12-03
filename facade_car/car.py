from engine import _IgnitionSystem, _Engine, _FuelTank, _Dashboard

class Car(object):
    def __init__(self):
        self.ignition_system = _IgnitionSystem()
        self.engine = _Engine()
        self.fuel_tank = _FuelTank()
        self.dashboard = _Dashboard()

    @property
    def km_per_litre(self):
        return 17.0

    def consume_fuel(self, km):
        litres = min(self.fuel_tank.level, km / self.km_per_litre)
        self.fuel_tank.level -= litres

    def start(self):
        print('\nStarting...')
        self.dashboard.show()
        if self.ignition_system.produce_spark():
            self.engine.turnon()
        else:
            print('Can\'t start. Faulty ignition system')

    def has_enough_fuel(self, km, km_per_litre):
        litres_needed = km / km_per_litre
        if self.fuel_tank.level > litres_needed:
            return True
        else:
            return False

    def drive(self, km=100):
        print('\n')
        if self.engine.revs_per_minute > 0:
            while self.has_enough_fuel(km, self.km_per_litre):
                self.consume_fuel(km)
                print('Drove {}km'.format(km))
                print('{:.2f}l of fuel still left'.format(self.fuel_tank.level))
        else:
            print('Can\'t drive. The Engine is turned off!')

    def park(self):
        print('\nParking...')
        self.dashboard.lights['handbreak'].is_on = True
        self.dashboard.show()
        self.engine.turnoff()

    def switch_fog_lights(self, status):
        print('\nSwitching {} fog lights...'.format(status))
        boolean = True if status == 'ON' else False
        self.dashboard.lights['fog'].is_on = boolean
        self.dashboard.show()

    def fill_up_tank(self):
        print('\nFuel tank filled up!')
        self.fuel_tank.level = 100
