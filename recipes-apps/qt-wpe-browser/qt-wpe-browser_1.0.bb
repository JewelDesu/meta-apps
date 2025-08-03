SUMMARY = "Qt wpe web browser Application"
LICENSE = "CLOSED"
SRC_URI = "file://qt-wpe-browser \
           file://qt-wpe-browser.desktop \
           file://qt-wpe-browser.sh"

S = "${WORKDIR}"

# Install files
do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/qt-wpe-browser ${D}${bindir}/qt-wpe-browser

    install -d ${D}${datadir}/applications
    install -m 0644 ${WORKDIR}/qt-wpe-browser.desktop ${D}${datadir}/applications/qt-wpe-browser.desktop

    install -d ${D}${datadir}/examples
    install -m 0755 ${WORKDIR}/qt-wpe-browser.sh ${D}${datadir}/examples/qt-wpe-browser.sh
}

# Ensure weston user can execute it
FILES:${PN} += "${bindir}/qt-wpe-browser ${datadir}/applications/qt-wpe-browser.desktop"