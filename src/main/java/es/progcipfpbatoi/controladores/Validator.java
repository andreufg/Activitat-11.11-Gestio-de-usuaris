package es.progcipfpbatoi.controladores;

public class Validator {

        public final static String DATE_REGEXP = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$";

        public final static String DNI_REGEXP = "[0-9]{7,8}[A-Z a-z]";

        public final static String CODIGO_POSTAL_REGEXP = "^(?:0?[1-9]|[1-4]\\d|5[0-2])\\d{3}$";
         public final static String TELEFONO_REGEXP = "(\\+34|0034|34)?[ -]*(6|7)[ -]*([0-9][ -]*){8}";
         public final static String MAIL_REGEXP = "^(.+)@(.+)$";
         public final static String NOMBRE_REGEXP = "[a-zA-Z]{5,20}";
         public final static String CONTRASENYA_REGEXP = "^(?=.*\\d)(?=.*[\\u0021-\\u002b\\u003c-\\u0040])(?=.*[A-Z])(?=.*[a-z])\\S{5,20}$";

        public static boolean isValidateDate(String date) {

            return date.matches(DATE_REGEXP);
        }

        public static boolean isValidDNI(String dni) {

            return dni.matches(DNI_REGEXP);

        }
        public static boolean isValidTelefono(String telefono) {
        return telefono.matches(TELEFONO_REGEXP);
         }
         public static boolean isValidCorreo(String correo) {

        return correo.matches(MAIL_REGEXP);
        }

        public static boolean isValidCodigoPostal(String codigoPostal) {

            return codigoPostal.matches(CODIGO_POSTAL_REGEXP);

        }
        public static boolean isValidCadenaTexto(String cadenaTexto) {

            return cadenaTexto.matches(NOMBRE_REGEXP);

        }
        public static boolean isValidContrasenya(String contrasenya) {

        return contrasenya.matches(CONTRASENYA_REGEXP);

        }
        public static boolean isValidRepetirContrasenya(String contrasenya1,String contrasenya2) {

        return contrasenya1.equals(contrasenya2);

         }
        public static boolean isValidCadenaNumeros(int numero) {

            return numero>4&&numero<100;

        }

}
