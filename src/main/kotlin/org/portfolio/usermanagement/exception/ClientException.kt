package org.portfolio.usermanagement.exception

class ClientException {
}

class DuplicateBusinessRegistrationCertificateException(businessRegistrationCertificate: String) :RuntimeException
    ("이미 존재하는 사업자 등록증 번호입니다. [$businessRegistrationCertificate]")