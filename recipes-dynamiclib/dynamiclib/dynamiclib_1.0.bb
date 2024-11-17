SUMMARY = "Dynamic Library Example"
LICENSE = "CLOSED"

SRC_URI = "file://lib.c \
           file://lib.h \
           file://Makefile"

S="${WORKDIR}"

do_compile(){
    cd ${S}
    make
}

do_install(){
    install -d ${D}${libdir}
    install -m 0755 ${S}/libmylib.so.1 ${D}${libdir}
}
