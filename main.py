#!/usr/bin/env pybricks-micropython
from pybricks.hubs import EV3Brick
from pybricks.ev3devices import (Motor, UltrasonicSensor, GyroSensor)
from pybricks.parameters import Port, Stop, Direction
from pybricks.tools import wait

class robotTurret:
    def __init__(self):
        self.ev3 = EV3Brick()
        self.rotationMotor = Motor(Port.A, Direction.CLOCKWISE)
        self.projectileMotor1 = Motor(Port.C, Direction.CLOCKWISE)
        self.projectileMotor2 = Motor(Port.D, Direction.CLOCKWISE)
        self.sensor = UltrasonicSensor(Port.S4)
        self.gyro = GyroSensor(Port.S1)

        self.speed = 60
        self.stepAngle = 3
        self.errorMargin = 100
        self.rotations = 0
        self.distanceList = [0] * int(360 / stepAngle)
        self.maxDistance = 400

    def shootProjectile(self):
        self.projectileMotor1.run(10000)
        self.projectileMotor2.run(10000)
        wait(300)
        self.projectileMotor1.stop()
        self.projectileMotor2.stop()
        wait(1000)
    
    def run(self):
        while True:
            self.rotationMotor.run(self.speed)
            gangle = self.gyro.angle()
            angleSection = int((gangle % 360) / self.stepAngle)
            angleSectionMinus1 = int(((gangle - self.stepAngle) % 360) / self.stepAngle)
            angleSectionPlus1 = int(((gangle + self.stepAngle) % 360) / self.stepAngle)
            angleSectionMinus2 = int(((gangle - 2 * self.stepAngle) % 360) / self.stepAngle)
            angleSectionPlus2 = int(((gangle + 2 * self.stepAngle) % 360) / self.stepAngle)

            self.rotations = gangle // 360
            distance = self.sensor.distance()

            if self.rotations < 1:
                self.ev3.screen.print(angleSection)
                if self.distanceList[angleSection] > distance or self.distanceList[angleSection] == 0:
                    self.distanceList[angleSection] = distance
            else:
                self.ev3.screen.print(str(angleSection) + ", " + str(self.distanceList[angleSection]) + ", " + str(distance)) 
                if (min(self.distanceList[angleSection], self.distanceList[prevAngleSection], self.distanceList[nextAngleSection], self.distanceList[angleSectionMinus2], self.distanceList[angleSectionPlus2]) - distance) > self.errorMargin and distance < self.maxDistance:
                    self.rotationMotor.stop()
                    self.shootProjectile()

robot = robotTurret()
robot.run()

