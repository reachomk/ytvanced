package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: rit */
public final class rit {
    public static void a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj != null) {
            int i;
            if (obj instanceof riu) {
                String str2;
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(rit.a(str));
                    stringBuffer2.append(" <\n");
                    stringBuffer.append("  ");
                }
                Class cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if (!("cachedSize".equals(name) || (modifiers & 1) != 1 || (modifiers & 8) == 8)) {
                        str2 = "_";
                        if (!(name.startsWith(str2) || name.endsWith(str2))) {
                            Class type = field.getType();
                            Object obj2 = field.get(obj);
                            if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                                rit.a(name, obj2, stringBuffer, stringBuffer2);
                            } else {
                                modifiers = obj2 != null ? Array.getLength(obj2) : 0;
                                for (int i2 = 0; i2 < modifiers; i2++) {
                                    rit.a(name, Array.get(obj2, i2), stringBuffer, stringBuffer2);
                                }
                            }
                        }
                    }
                }
                for (Method name2 : cls.getMethods()) {
                    String name3 = name2.getName();
                    if (name3.startsWith("set")) {
                        name3 = name3.substring(3);
                        try {
                            String str3 = "has";
                            str2 = String.valueOf(name3);
                            if (str2.length() == 0) {
                                str2 = new String(str3);
                            } else {
                                str2 = str3.concat(str2);
                            }
                            if (((Boolean) cls.getMethod(str2, new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                                str3 = "get";
                                str2 = String.valueOf(name3);
                                if (str2.length() == 0) {
                                    str2 = new String(str3);
                                } else {
                                    str2 = str3.concat(str2);
                                }
                                rit.a(name3, cls.getMethod(str2, new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                }
                return;
            }
            str = rit.a(str);
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(str);
            stringBuffer2.append(": ");
            int length2;
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!str4.startsWith("http") && str4.length() > 200) {
                    str4 = String.valueOf(str4.substring(0, 200)).concat("[...]");
                }
                length2 = str4.length();
                StringBuilder stringBuilder = new StringBuilder(length2);
                for (i = 0; i < length2; i++) {
                    char charAt = str4.charAt(i);
                    if (charAt >= ' ' && charAt <= '~' && charAt != '\"' && charAt != '\'') {
                        stringBuilder.append(charAt);
                    } else {
                        stringBuilder.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                    }
                }
                str = stringBuilder.toString();
                str4 = "\"";
                stringBuffer2.append(str4);
                stringBuffer2.append(str);
                stringBuffer2.append(str4);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                stringBuffer2.append('\"');
                for (byte b : bArr) {
                    int i3 = b & 255;
                    char c = (char) i3;
                    if (i3 == 92 || i3 == 34) {
                        stringBuffer2.append('\\');
                        stringBuffer2.append(c);
                    } else if (i3 >= 32 && i3 < 127) {
                        stringBuffer2.append(c);
                    } else {
                        stringBuffer2.append(String.format("\\%03o", new Object[]{Integer.valueOf(i3)}));
                    }
                }
                stringBuffer2.append('\"');
            } else {
                stringBuffer2.append(obj);
            }
            stringBuffer2.append("\n");
        }
    }

    private static String a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }
}
