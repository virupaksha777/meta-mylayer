LICENSE="GPLv2"

LIC_FILES_CHKSUM="file://COPYING.LESSER;md5=4fbd65380cdd255951079008b364516c"

SRC_URI="git://github.com/stephane/libmodbus.git;protocol=https"

S="${WORKDIR}/git"

inherit autotools

EXTRA_OECONF="--prefix=/usr"