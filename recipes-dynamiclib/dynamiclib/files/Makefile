all: libmylib.so.1

libmylib.so.1: lib.o
	${CC} ${LDFLAGS} *.o -shared -o libmylib.so.1 

lib.o: lib.c
	${CC} ${LDFLAGS} *.c -c -fPIC

clean:
	rm -f *.o *.so.1

