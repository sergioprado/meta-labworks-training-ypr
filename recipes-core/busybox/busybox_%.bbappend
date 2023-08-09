FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://disable-dhcp.cfg \
"

RRECOMMENDS:${PN}:remove = "busybox-udhcpc"
