//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//      task_1
        int width;
        int lenght;
        lenght = 2;
        width = 5;
        int area;
        area = lenght * width;
        System.out.println("Task_1 : Area = " + area);

//      task_2
        double weight = 62.9;
        double height = 1.64;
        double bodyMassIndex;
        bodyMassIndex = weight / (height * height);
        System.out.println("Task_2 : BodyMassIndex = " + bodyMassIndex);

//      task_3
        double temperatureCelcius = 26;
        double temperatureF;
        double index1 = 9.0;
        double index2 = 5.0;
        temperatureF = (index1 / index2)* temperatureCelcius + 32;
        System.out.println("Task_3 : TemperatureF = " + temperatureF);

//      task_4
        int variableMax = 2147483647;
        int variableUnknown;
        variableUnknown = variableMax +1;
        System.out.println("Task_4 : VariableUnknown = " + variableUnknown);

//      task_5
        double variableFractional = 3.14;
        int variableInteger;
        variableInteger = (int) variableFractional;
        System.out.printf("Task_5 : VariableFractional = " + variableFractional);
        System.out.println(" and " + variableInteger );

//      task_6
        int age1 = 18;
        int age2 = 43;
        boolean isAgeOk = age2 >= age1;
        System.out.println("Task_6 : IsAgeOk = " + isAgeOk);

//      task_7
        char a = 'H';
        char b = (char) (a + 12);
        System.out.printf("Task_7 : a = " + a);
        System.out.println(" and b = " + b );
        }
    }
