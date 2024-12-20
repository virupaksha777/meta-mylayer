SUMMARY = "Simple helloworld application"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://hellocpp.cpp"

S = "${WORKDIR}"

do_compile() {
         cd ${S}
         ${CXX} ${LDFLAGS} hellocpp.cpp -o hellocpp
}

do_install() {
         install -d ${D}/usr/bin
         install -m 0755 ${S}/hellocpp ${D}/usr/bin
}