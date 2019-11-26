package defpackage;

import java.io.Serializable;

/* renamed from: bcvg */
public final class bcvg extends RuntimeException {
    public static final long serialVersionUID = -3454462756050397899L;
    public final Object a;

    public bcvg(Object obj) {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OnError while emitting onNext value: ");
        if (obj == null) {
            str = "null";
        } else if (bcvj.a.contains(obj.getClass())) {
            str = obj.toString();
        } else if (obj instanceof String) {
            str = (String) obj;
        } else if (obj instanceof Enum) {
            str = ((Enum) obj).name();
        } else {
            bdey.a.a();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(obj.getClass().getName());
            stringBuilder2.append(".class");
            str = stringBuilder2.toString();
        }
        stringBuilder.append(str);
        super(stringBuilder.toString());
        if (!(obj instanceof Serializable)) {
            try {
                obj = String.valueOf(obj);
            } catch (Throwable th) {
                obj = th.getMessage();
            }
        }
        this.a = obj;
    }
}
