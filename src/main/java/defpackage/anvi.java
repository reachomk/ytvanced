package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: anvi */
public abstract class anvi implements anzd {
    public abstract anvi clone();

    public abstract anvi internalMergeFrom(anvf anvf);

    public abstract anvi mergeFrom(anwf anwf, anxa anxa);

    public anvi mergeFrom(byte[] bArr, int i, int i2) {
        throw null;
    }

    public anvi mergeFrom(byte[] bArr, int i, int i2, anxa anxa) {
        throw null;
    }

    public anvi mergeFrom(anvu anvu, anxa anxa) {
        try {
            anwf g = anvu.g();
            mergeFrom(g, anxa);
            g.a(0);
            return this;
        } catch (anyg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
        }
    }

    public anvi mergeFrom(byte[] bArr) {
        return mergeFrom(bArr, 0, bArr.length);
    }

    public anvi mergeFrom(byte[] bArr, anxa anxa) {
        return mergeFrom(bArr, 0, bArr.length, anxa);
    }

    public anvi mergeFrom(anze anze) {
        if (getDefaultInstanceForType().getClass().isInstance(anze)) {
            return internalMergeFrom((anvf) anze);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    private String getReadingExceptionMessage(String str) {
        String name = getClass().getName();
        StringBuilder stringBuilder = new StringBuilder((name.length() + 60) + String.valueOf(str).length());
        stringBuilder.append("Reading ");
        stringBuilder.append(name);
        stringBuilder.append(" from a ");
        stringBuilder.append(str);
        stringBuilder.append(" threw an IOException (should never happen).");
        return stringBuilder.toString();
    }

    private static void addAllCheckingNulls(Iterable iterable, List list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size = list.size();
        for (Object next : iterable) {
            if (next == null) {
                int size2 = list.size();
                StringBuilder stringBuilder = new StringBuilder(37);
                stringBuilder.append("Element at index ");
                stringBuilder.append(size2 - size);
                stringBuilder.append(" is null.");
                String stringBuilder2 = stringBuilder.toString();
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 >= size) {
                        list.remove(size3);
                    } else {
                        throw new NullPointerException(stringBuilder2);
                    }
                }
            }
            list.add(next);
        }
    }

    protected static aoas newUninitializedMessageException(anze anze) {
        return new aoas();
    }

    protected static void addAll(Iterable iterable, List list) {
        anxw.a((Object) iterable);
        if (iterable instanceof anyo) {
            List d = ((anyo) iterable).d();
            anyo anyo = (anyo) list;
            int size = list.size();
            for (Object next : d) {
                if (next == null) {
                    int size2 = anyo.size();
                    StringBuilder stringBuilder = new StringBuilder(37);
                    stringBuilder.append("Element at index ");
                    stringBuilder.append(size2 - size);
                    stringBuilder.append(" is null.");
                    String stringBuilder2 = stringBuilder.toString();
                    int size3 = anyo.size();
                    while (true) {
                        size3--;
                        if (size3 >= size) {
                            anyo.remove(size3);
                        } else {
                            throw new NullPointerException(stringBuilder2);
                        }
                    }
                } else if (next instanceof anvu) {
                    anyo.a((anvu) next);
                } else {
                    anyo.add((String) next);
                }
            }
        } else if (iterable instanceof anzp) {
            list.addAll((Collection) iterable);
        } else {
            anvi.addAllCheckingNulls(iterable, list);
        }
    }
}
