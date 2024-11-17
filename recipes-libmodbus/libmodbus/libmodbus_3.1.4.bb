LICENSE="GPLv2"

LIC_FILES_CHKSUM="file://COPYING.LESSER;md5=4fbd65380cdd255951079008b364516c"

SRC_URI="git://github.com/stephane/libmodbus.git;protocol=https"

SRCREV="f9358460ee1f62bcac716ad0444b3bbe7628b204"

S="${WORKDIR}/git"

DEPENDS="autoconf-native acl-native automake-native"

do_configure(){
    cd ${S}
    ./autogen.sh 
    ./configure --prefix=/usr --host=arm-poky-linux-gnueabi
}
do_compile(){
    cd ${S}
    make
}
do_install(){
    cd ${S}
    make install DESTDIR="${D}" 
}