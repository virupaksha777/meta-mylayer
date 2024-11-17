DESCRIPTION="Hello configuration example"

LICENSE="CLOSED"

SRC_URI="file://hello.cpp \ 
         file://hello.h \ 
         file://configure.ac \ 
         file://Makefile.am"

S="${WORKDIR}"

inherit autotools

do_configure(){
    # Your code here
    cd ${S}
    aclocal
    autoconf
    automake --add-missing
    ./configure --prefix=/usr --host=arm-poky-linux-gnueabi
}
do_compile(){
    # Your code here
    cd ${S}
    make
}
do_install(){
    # Your code here
    cd ${S}
    make install DESTDIR=${D} 
}