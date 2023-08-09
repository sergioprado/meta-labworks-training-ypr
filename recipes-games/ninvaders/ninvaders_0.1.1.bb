DESCRIPTION = "nInvaders is a Space Invaders clone based on ncurses for ASCII output"
HOMEPAGE = "http://ninvaders.sourceforge.net/"
SECTION = "games"

DEPENDS = "ncurses"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://gpl.txt;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "git://github.com/sergioprado/ninvaders.git;branch=main;protocol=https"
SRCREV = "c3c76563b8527c4c90dd4d58c80f2755e146cfab"

S = "${WORKDIR}/git"

do_install() {
     install -d ${D}${bindir}
     install -m 0755 nInvaders ${D}${bindir}
}
