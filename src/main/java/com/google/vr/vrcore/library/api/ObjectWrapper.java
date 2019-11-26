package com.google.vr.vrcore.library.api;

import android.os.IBinder;
import defpackage.bajz;
import defpackage.baka;
import java.lang.reflect.Field;

public final class ObjectWrapper extends bajz {
    public final Object wrappedObject;

    private ObjectWrapper(Object obj) {
        this.wrappedObject = obj;
    }

    public static baka a(Object obj) {
        return new ObjectWrapper(obj);
    }

    public static Object a(baka baka, Class cls) {
        String str = "remoteBinder is the wrong class.";
        if (baka == null) {
            return null;
        }
        if (baka instanceof ObjectWrapper) {
            return ((ObjectWrapper) baka).wrappedObject;
        }
        IBinder asBinder = baka.asBinder();
        Field field = null;
        for (Field field2 : asBinder.getClass().getDeclaredFields()) {
            if (!field2.isSynthetic()) {
                if (field != null) {
                    field = null;
                    break;
                }
                field = field2;
            }
        }
        if (field == null) {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        } else if (field.isAccessible()) {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        } else {
            field.setAccessible(true);
            try {
                Object obj = field.get(asBinder);
                if (obj == null) {
                    return null;
                }
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
                throw new IllegalArgumentException(str);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException(str, e2);
            } catch (IllegalAccessException e3) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
            }
        }
    }
}
