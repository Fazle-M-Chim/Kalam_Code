# The program allows the user to enter data for a lineman,  a Quarterback,
# and a RunningBack, then display this information.
# Creates a Football player class that stores the basic info
class FootballPlayer:
    def __init__(self, first_name, last_name, weight, uniform_num):
        self.first_name = first_name
        self.last_name = last_name
        self.weight = weight
        self.uniform_num = uniform_num

    def get_first_name(self):
        return self.first_name

    def get_last_name(self):
        return self.last_name

    def get_weight(self):
        return self.weight

    def get_uniform_number(self):
        return self.uniform_num


# Creates a quarterback data
class Quarterback(FootballPlayer):
    def __init__(self, a, c, y, t, i, first_name, last_name, weight, uniform_num):
        super().__init__(first_name, last_name, weight, uniform_num)
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

    def get_first_name(self):
        return self.first_name

    def get_last_name(self):
        return self.last_name

    def get_weight(self):
        return self.weight

    def get_uniform_number(self):
        return self.uniform_num

    def get_completions(self):
        return self.com

    def get_attempts(self):
        return self.att

    def get_yards(self):
        return self.yd

    def get_touchdowns(self):
        return self.td

    def get_interceptions(self):
        return self.int


# Creates a class for the Running back data
class RunningBack(FootballPlayer):
    def __init__(self, a, y, t, first_name, last_name, weight, uniform_num):
        super().__init__(first_name, last_name, weight, uniform_num)
        self.att = a
        self.yd = y
        self.td = t

    def get_first_name(self):
        return self.first_name

    def get_last_name(self):
        return self.last_name

    def get_weight(self):
        return self.weight

    def get_uniform_number(self):
        return self.uniform_num

    def get_attempts(self):
        return self.att

    def get_yards(self):
        return self.yd

    def get_touchdowns(self):
        return self.td


# Checks if the weight entered is physically possible or not
def check_weight(weight):
    while weight < 0 or weight > 1400:
        print("The weight entered is incorrect. Please try again")
        weight = float(input("Enter the weight in pounds: "))


# Check if the uniform number is a whole positive number or not
def check_uniform_num(uniform_num):
    while uniform_num < 0:
        print("The uniform number entered is incorrect. Please try again")
        uniform_num = int(input("Enter the uniform number :"))


# Checks to make sure that the number of passes completed is less than the passes attempted
def att_comp(a, c):
    while c > a:
        print("The number of passes completed cannot be greater than the1 number of passes attempted")
        a = float(input("Enter the number of passes attempted : "))
        c = float(input("Enter the number of passes completed : "))
    while a <= 0:
        print("The value of passes attempted is incorrect")
        a = float(input("Enter the number of passes attempted : "))


# Checks if the number of touchdowns is less than the number of passes completed
def comp_td(c, t):
    while t > c:
        print("The number of touchdowns cannot be greater than the number of passes completed")
        c = float(input("Enter the number of passes completed : "))
        t = float(input("Enter the number of touchdowns thrown : "))


# Checks if the number of yards entered is correct
def gross_yards(y, c):
    while y > 99 * c or y < -20 * c:
        print("The number of yards passing is incorrect.")
        y = float(input("Enter the number of gross yards passing : "))


def get_data():
    global first_name, last_name, weight, uniform_num
    first_name = input("Enter the first name of the player: ")
    last_name = input("Enter the last name of the player: ")
    weight = float(input("Enter the weight in pounds: "))
    check_weight(weight)
    uniform_num = int(input("Enter the uniform number: "))
    check_uniform_num(uniform_num)


# Gets the game info for a Quarterback
def get_game_info_qb():
    global a, c, y, t, i
    a = int(input("Enter the number of passes attempted : "))
    c = int(input("Enter the number of passes completed : "))
    att_comp(a, c)
    y = float(input("Enter the number of gross yards passing : "))
    gross_yards(y, c)
    t = int(input("Enter the number of touchdowns thrown : "))
    comp_td(c, t)
    i = int(input("Enter the number of interceptions thrown : "))


# Gets the game info for a Running back
def get_game_info_rb():
    global a, y, t
    a = int(input("Enter the number of passes attempted : "))
    y = float(input("Enter the number of gross yards passing : "))
    t = int(input("Enter the number of touchdowns thrown : "))


# Extracts the data and displays it from the class
def show_data(my_obj):
    print("Name :", my_obj.get_first_name(), my_obj.get_last_name())
    print("Weight :", my_obj.get_weight())
    print("Uniform Number :", my_obj.get_uniform_number())


# main
print("Football Player Program", end="\n")
print("Enter data below for a Lineman")
get_data()
my_obj_L = FootballPlayer(first_name, last_name, weight, uniform_num)
print()
print("Enter data below for a Quarterback")
get_data()
get_game_info_qb()
my_obj_QB = Quarterback(a, c, y, t, i, first_name, last_name, weight, uniform_num)
print()
print("Enter data below for a Running-back")
get_data()
get_game_info_rb()
my_obj_RB = RunningBack(a, y, t, first_name, last_name, weight, uniform_num)
print()
print("Lineman info")
show_data(my_obj_L)
print()
print("Quarterback info")
show_data(my_obj_QB)
print("Attempts :", my_obj_QB.get_attempts())
print("Completions :", my_obj_QB.get_completions())
print("Yards :", my_obj_QB.get_yards())
print("Touchdowns :", my_obj_QB.get_touchdowns())\
print("Interceptions :", my_obj_QB.get_interceptions())
my_obj_QB.print_QBR()
print()
print("Running back info")
show_data(my_obj_RB)
print("Attempts :", my_obj_RB.get_attempts())
print("Yards :", my_obj_RB.get_yards())
print("Touchdowns :", my_obj_RB.get_touchdowns())
