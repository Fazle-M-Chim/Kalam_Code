# Wind Chill Calculator
import math
import statistics


def wind_chill_calc(a, b):
    wind_vc = math.pow(b, 0.16)
    t_wc = 35.74 + (0.6125 * a) - (35.75 * wind_vc) + (0.4275 * a * wind_vc)
    return t_wc


# main
print("This is a program to calculate the wind chill temperature.")
ans = "y"
data_wind_chill = []
data_wc_calc = []
while ans == "y" or ans == "y" or ans == "yes":
    air_temp = 100
    wind_speed = 0
    t_wc = 0
    while air_temp > 50  or air_temp < -459.67:
        air_temp = float(input("Enter the air temperature in Fahrenheit" +
                               " (which should not exceed 50F) : "))
        if air_temp > 50:
            print("The air temperature exceeds 50F. Please enter it again")
        elif air_temp < -459.67:
            print("The air temperature is impossible. Please enter it again")
    while wind_speed < 3:
        wind_speed = float(input("Enter the wind speed in miles per hour" +
                                 " (which should not be less than 3 mph) : "))
        if wind_speed < 3:
            print("The wind speed is lower than 3 mph. Please enter it again")
    t_wc = wind_chill_calc(air_temp, wind_speed)
    print("The wind chill temperature is : ",
          format(t_wc, '.1f'), "F", sep="")
    c = [air_temp, wind_speed]
    data_wc_calc.append(c)
    data_wind_chill.append(t_wc)
    ans = input("Do you wish to continue (y/n) : ")
avg_wind_chill = statistics.mean(data_wind_chill)
print("The average of all the wind chill temperatures is : ",
      format(avg_wind_chill, '.1f'), "F", sep="")
file_name = input("Enter the name of the file to which this data should be saved : ")
file_obj = open(file_name + ".txt", "w")
string_wind_chill = str(format(avg_wind_chill,".1f"))
string_wc_calc = "".join(map(str,data_wc_calc))
file_obj.write("All data entered to calculate wind chill temperature is \n")
file_obj.write("(The first element in the list represents the air temperature and the second element represents the wind speed): \n" )
file_obj.write(string_wc_calc)
file_obj.write("\n")
file_obj.write("The average of all the wind chill temperatures is : ")
file_obj.write(string_wind_chill)
file_obj.write("F")
print("The data has been written to the file ", file_name, ".txt", sep="")
file_obj.close()
