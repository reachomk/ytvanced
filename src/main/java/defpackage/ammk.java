package defpackage;

import android.os.IBinder;
import java.lang.reflect.Field;

/* renamed from: ammk */
public final class ammk extends ammi {
    private final Object a;

    private ammk(Object obj) {
        this.a = obj;
    }

    public static ammf a(Object obj) {
        return new ammk(obj);
    }

    public static Object a(ammf ammf) {
        if (ammf instanceof ammk) {
            return ((ammk) ammf).a;
        }
        IBinder asBinder = ammf.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (field.isAccessible()) {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
            } catch (IllegalAccessException e3) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
            }
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
}
