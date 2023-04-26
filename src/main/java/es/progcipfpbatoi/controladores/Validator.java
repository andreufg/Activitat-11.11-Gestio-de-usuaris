package es.progcipfpbatoi.controladores;

public class Validator {

        public final static String DATE_REGEXP = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$";

        public final static String DNI_REGEXP = "[0-9]{7,8}[A-Z a-z]";

        public final static String CODIGO_POSTAL_REGEXP = "o(([1-4][0-9][0-9][0-9][0-9])|(0(?=[1-9][0-9][0-9][0-9]))|(5(?=[0-2][0-9][0-9][0-9])))";
         public final static String TELEFONO_REGEXP = "^(0034|\\\\+34|34)[67]\\\\d{7}$";
         public final static String MAIL_REGEXP = "^[a-zA-Z0-9]+([\\\\.-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+([\\\\.-]?[a-zA-Z0-9]+)*\\\\.[a-zA-Z]{2,}$";

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

            return cadenaTexto.matches(String.valueOf(cadenaTexto.length()>=5 && cadenaTexto.length()<=20));

        }
        public static boolean isValidCadenaTexto(int numero) {

            return numero>4&&numero<100;

        }

}
