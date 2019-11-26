package defpackage;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: cni */
public final class cni {
    public static boolean a(Object obj, Object obj2) {
        if (obj == null || obj2 == null || obj.getClass() != obj2.getClass()) {
            throw new IllegalArgumentException("The input is invalid.");
        }
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(cue.class)) {
                Class type = field.getType();
                try {
                    field.setAccessible(true);
                    Object obj3 = field.get(obj);
                    Object obj4 = field.get(obj2);
                    field.setAccessible(false);
                    int a = ((cue) field.getAnnotation(cue.class)).a();
                    switch (a) {
                        case 0:
                            if (Float.compare(((Float) obj3).floatValue(), ((Float) obj4).floatValue()) == 0) {
                                break;
                            }
                            return false;
                        case 1:
                            if (Double.compare(((Double) obj3).doubleValue(), ((Double) obj4).doubleValue()) == 0) {
                                break;
                            }
                            return false;
                        case 2:
                            Class componentType = type.getComponentType();
                            if (!Byte.TYPE.isAssignableFrom(componentType)) {
                                if (!Short.TYPE.isAssignableFrom(componentType)) {
                                    if (!Character.TYPE.isAssignableFrom(componentType)) {
                                        if (!Integer.TYPE.isAssignableFrom(componentType)) {
                                            if (!Long.TYPE.isAssignableFrom(componentType)) {
                                                if (!Float.TYPE.isAssignableFrom(componentType)) {
                                                    if (!Double.TYPE.isAssignableFrom(componentType)) {
                                                        if (!Boolean.TYPE.isAssignableFrom(componentType)) {
                                                            if (Arrays.equals((Object[]) obj3, (Object[]) obj4)) {
                                                                break;
                                                            }
                                                        } else if (Arrays.equals((boolean[]) obj3, (boolean[]) obj4)) {
                                                            break;
                                                        }
                                                    } else if (Arrays.equals((double[]) obj3, (double[]) obj4)) {
                                                        break;
                                                    }
                                                } else if (Arrays.equals((float[]) obj3, (float[]) obj4)) {
                                                    break;
                                                }
                                            } else if (Arrays.equals((long[]) obj3, (long[]) obj4)) {
                                                break;
                                            }
                                        } else if (Arrays.equals((int[]) obj3, (int[]) obj4)) {
                                            break;
                                        }
                                    } else if (Arrays.equals((char[]) obj3, (char[]) obj4)) {
                                        break;
                                    }
                                } else if (Arrays.equals((short[]) obj3, (short[]) obj4)) {
                                    break;
                                }
                            } else if (Arrays.equals((byte[]) obj3, (byte[]) obj4)) {
                                break;
                            }
                            return false;
                        case 3:
                            if (obj3.equals(obj4)) {
                                break;
                            }
                            return false;
                        case 4:
                            if (!cvu.a((cvu) obj3, (cvu) obj4)) {
                                break;
                            }
                            return false;
                        case 5:
                            Collection collection = (Collection) obj3;
                            Collection collection2 = (Collection) obj4;
                            if (collection == null) {
                                if (collection2 == null) {
                                    break;
                                }
                            } else if (collection.equals(collection2)) {
                                break;
                            }
                            return false;
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            if (cni.a(a - 5, (Collection) obj3, (Collection) obj4)) {
                                break;
                            }
                            return false;
                        case 10:
                        case 15:
                            if (obj3 == null) {
                                if (obj4 == null) {
                                    break;
                                }
                            } else if (((cof) obj3).a(obj4)) {
                                break;
                            }
                            return false;
                        case 11:
                        case 12:
                            if (obj3 != null) {
                                if (((coj) obj3).a((coj) obj4)) {
                                    break;
                                }
                            } else if (obj4 == null) {
                                break;
                            }
                            return false;
                        case 13:
                            if (obj3 == null) {
                                if (obj4 == null) {
                                    break;
                                }
                            } else if (obj3.equals(obj4)) {
                                break;
                            }
                            return false;
                        case 14:
                            if (cni.a(obj3, obj4)) {
                                break;
                            }
                            return false;
                        default:
                            continue;
                    }
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException("Unable to get fields by reflection.", e);
                }
            }
        }
        return true;
    }

    private static boolean a(int i, Collection collection, Collection collection2) {
        if (i <= 0) {
            throw new IllegalArgumentException("Level cannot be < 1");
        } else if (collection == null && collection2 == null) {
            return true;
        } else {
            if (collection == null ? collection2 != null : collection2 == null || collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection.iterator();
            Iterator it2 = collection2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                if (i != 1) {
                    if (!cni.a(i - 1, (Collection) it.next(), (Collection) it2.next())) {
                        return false;
                    }
                } else if (!((cma) it.next()).a((cma) it2.next())) {
                    return false;
                }
            }
            return true;
        }
    }
}
