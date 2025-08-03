SUMMARY = "NWT4 Qt Application"
LICENSE = "CLOSED"
SRC_URI = "file://NWT4 \
           file://nwt4.desktop \
           file://nwt4.sh"

S = "${WORKDIR}"

# Install files
do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/NWT4 ${D}${bindir}/NWT4

    install -d ${D}${datadir}/applications
    install -m 0644 ${WORKDIR}/nwt4.desktop ${D}${datadir}/applications/nwt4.desktop

    install -d ${D}${datadir}/${PN}
    install -m 0755 ${WORKDIR}/nwt4.sh ${D}${datadir}/${PN}
}

# Ensure weston user can execute it
#FILES:${PN} += "${bindir}/NWT4 ${datadir}/applications/nwt4.desktop"