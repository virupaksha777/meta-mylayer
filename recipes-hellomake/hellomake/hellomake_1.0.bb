DESCRIPTION="Hello make file example"

LICENSE="CLOSED"

SRC_URI = "file://main.c \ 
           file://Makefile"

S="${WORKDIR}"

inherit autotools

do_compile() {
    cd ${S}
    oe_runmake
}

do_install() {
        install -d ${D}/usr/bin
        install -m 0755 ${S}/main ${D}/usr/bin
}
