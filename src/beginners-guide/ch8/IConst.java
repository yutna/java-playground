/*
 *
 * Variables in Interface
 *
 * NOTE - Reminder agian, Variables can be declared in an interface, but they
 * are implicitly `public`, `static` and `final`.
 *
 * NOTE - To define a set of shared constants, create an interface that contains
 * only these constants, without any methods. Each file that needs access to the
 * constants simply `implements` the interface.
 *
 * NOTE - The technique of using an interface to define shared constants is controversial.
 * (ยังเป็นที่ถกเถียงกันอยู่) - ส่วนตัวถือว่าโอเคนะ สำหรับในเคสของ Java
 */

// An interface that contains constants.
interface IConst {
    int MIN = 0;
    int MAX = 10;

    String ERRORMSG = "Boundary Error";
}
