//Noncompliant Code Example (Security Policy File)
//This noncompliant example grants AllPermission to the klib library. 

// Grant the klib library AllPermission
grant codebase "file:${klib.home}/j2se/home/klib.jar" {
 permission java.security.AllPermission;
};
