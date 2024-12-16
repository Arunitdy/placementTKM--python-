import datetime as date


def age(year):
    return currentYear().year-year


def currentYear():
    print("current year",date.datetime.today().year)
    return date.datetime.today().year