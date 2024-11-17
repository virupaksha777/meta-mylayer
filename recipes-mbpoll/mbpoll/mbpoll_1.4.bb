LICENSE="GPLv3"

LIC_FILES_CHKSUM="file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI="https://github.com/epsilonrt/mbpoll/archive/refs/tags/v1.4.tar.gz;protocol=file"

SRC_URI[md5sum]="41130839eb2231b86bd74598eee274f7"

SRC_URI[sha256sum]="88f4b97c0e6825d3abaf8448092c51e11bc160a3806cb738e0654e1e5751e9e3"

S="${WORKDIR}/mbpoll-1.4"

inherit autotools

do_configure(){
    cd ${S}
    #aclocal
    #autoconf
    #automake --add-missing
    #./configure --prefix=/usr --host=arm-poky-linux-gnueabi
    autoreconf -i
    ./configure --prefix=/usr --host=arm-poky-linux-gnueabi
}
do_compile(){
    cd ${S}
    make
}
do_install(){
    cd ${S}
    make install DESTDIR=${D} 
}