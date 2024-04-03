let instance = null;

function Database () {

    function createDatabase() {
        return {
            host: 'localhost',
            user: 'root',
            password: '',
            database: 'mydatabase'
        };
    }

    instance = createDatabase();
    return instance;
}

function useDatabase() {
    if (!instance) {
        instance = new Database();
    }
    return instance;
}

let banco = useDatabase();
let banco2 = useDatabase();
console.log(banco.host)
console.log(banco2.host)
banco2.host = 'blah';
console.log(banco.host)
console.log(banco2.host)