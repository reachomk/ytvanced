package defpackage;

import android.os.IBinder;
import java.lang.reflect.Field;

/* renamed from: qct */
public final class qct extends qcr {
    private final Object a;

    private qct(Object obj) {
        this.a = obj;
    }

    public static qcs a(Object obj) {
        return new qct(obj);
    }

    public static Object a(qcs qcs) {
        if (qcs instanceof qct) {
            return ((qct) qcs).a;
        }
        IBinder asBinder = qcs.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("Unexpected number of IObjectWrapper declared fields: ");
            stringBuilder.append(length);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        } else {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        }
    }
}
