//import { indexTest } from "../calculadora";
const indexTest = require ("../calculadora");
test ("test suma", () => {
    const r = indexTest.suma(1,5)
    expect (r).toBe(6)
});
test.todo("test de resta");
test.todo("test de multiply");
test.todo("test de divide");
