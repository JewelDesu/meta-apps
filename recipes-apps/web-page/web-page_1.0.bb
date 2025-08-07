SUMMARY = "Html webpage demo"
LICENSE = "CLOSED"
SRC_URI = "file://index.html \"

DEPENDS = "nginx"

NGINX_WWWDIR ?= "${localstatedir}/www/localhost

# Install files
do_install() {
    rm ${D}${NGINX_WWWDIR}/html/index.html
    mv ${WORKDIR}/index.html ${D}${NGINX_WWWDIR}/html
}
