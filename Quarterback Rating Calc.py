# Create a Class Quarterback to calculate the Quarterback Rating.

class Quarterback:
    # Initializing the class
    def __init__ (self, a, c, y, t, i):
        self.att = a
        self.com = c
        self.yd = y
        self.td = t
        self.int = i
        self.QBR = 0

    def calc_QBR (self):
        self.QBR = 100 * (((self.com/self.att * 100 - 30)/20) + ((self.yd/self.att - 3)/4)\
                         + ((self.td/self.att * 100)/5) + ((1/4) * (9.5 - (self.int/self.att) * 100))) / 6
        return self.QBR

    def print_QBR (self):
        print("The Quarterback Rating is {:.1f}".format(self.calc_QBR()))


def att_comp (a, c):
    while c > a:
        print("The number of passes completed cannot be greater than the1 number of passes attempted")
        a = float(input("Enter the number of passes attempted : "))
        c = float(input("Enter the number of passes completed : "))
    while a <= 0:
        print("The value of passes attempted is incorrect")
        a = float(input("Enter the number of passes attempted : "))


def comp_td (c, t):
    while t > c:
        print("The number of touchdowns cannot be greater than the number of passes completed")
        c = float(input("Enter the number of passes completed : "))
        t = float(input("Enter the number of touchdowns thrown : "))


def gross_yards(y, c):
    while y > 99 * c or y < -20 * c:
        print("The number of yards passing is incorrect.")
        y = float(input("Enter the number of gross yards passing : "))


# main

a = float(input("Enter the number of passes attempted : "))
c = float(input("Enter the number of passes completed : "))
att_comp(a, c)
y = float(input("Enter the number of gross yards passing : "))
gross_yards(y, c)
t = float(input("Enter the number of touchdowns thrown : "))
comp_td(c, t)
i = float(input("Enter the number of interceptions thrown : "))
my_obj = Quarterback(a, c, y, t, i)
my_obj.print_QBR()
