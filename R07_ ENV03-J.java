// This compliant solution shows a policy file that can be used to enforce fine-grained permissions.

// Grant the klib library AllPermission
grant codeBase
 "file:${klib.home}/j2se/home/klib.jar", signedBy "Admin" {
 permission java.io.FilePermission "/tmp/*", "read";
 permission java.io.SocketPermission "*", "connect";
};
