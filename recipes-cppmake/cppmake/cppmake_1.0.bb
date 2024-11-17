DESCRIPTOIN="Makefile recipe for the cpp "

LICENSE="CLOSED"

SRC_URI = "file://hellocpp.cpp \ 
           file://Makefile"

S="${WORKDIR}"

inherit autotools
do_compile(){
    cd ${S}
    oe_runmake

}
do_install(){
        install -d ${D}/usr/bin
        install -m 0755 ${S}/hellocpp ${D}/usr/bin

}