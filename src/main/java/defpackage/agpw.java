package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: agpw */
public final class agpw {
    public final Map a = new HashMap();

    public agpw(byte[] bArr) {
        if (bArr.length > 0) {
            synchronized (this.a) {
                try {
                    this.a.clear();
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
                    int readInt = dataInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        String readUTF = dataInputStream.readUTF();
                        byte readByte = dataInputStream.readByte();
                        int readInt2;
                        int i2;
                        switch (readByte) {
                            case (byte) 1:
                                this.a.put(readUTF, dataInputStream.readUTF());
                                break;
                            case (byte) 2:
                                readInt2 = dataInputStream.readInt();
                                String[] strArr = new String[readInt2];
                                for (i2 = 0; i2 < readInt2; i2++) {
                                    strArr[i2] = dataInputStream.readUTF();
                                }
                                this.a.put(readUTF, strArr);
                                break;
                            case (byte) 3:
                                this.a.put(readUTF, Long.valueOf(dataInputStream.readLong()));
                                break;
                            case (byte) 4:
                                readInt2 = dataInputStream.readInt();
                                long[] jArr = new long[readInt2];
                                for (i2 = 0; i2 < readInt2; i2++) {
                                    jArr[i2] = dataInputStream.readLong();
                                }
                                this.a.put(readUTF, jArr);
                                break;
                            case (byte) 5:
                                this.a.put(readUTF, Integer.valueOf(dataInputStream.readInt()));
                                break;
                            case (byte) 6:
                                readInt2 = dataInputStream.readInt();
                                int[] iArr = new int[readInt2];
                                for (i2 = 0; i2 < readInt2; i2++) {
                                    iArr[i2] = dataInputStream.readInt();
                                }
                                this.a.put(readUTF, iArr);
                                break;
                            case (byte) 7:
                                this.a.put(readUTF, Boolean.valueOf(dataInputStream.readBoolean()));
                                break;
                            case (byte) 8:
                                readInt2 = dataInputStream.readInt();
                                boolean[] zArr = new boolean[readInt2];
                                for (i2 = 0; i2 < readInt2; i2++) {
                                    zArr[i2] = dataInputStream.readBoolean();
                                }
                                this.a.put(readUTF, zArr);
                                break;
                            case (byte) 9:
                                this.a.put(readUTF, Byte.valueOf(dataInputStream.readByte()));
                                break;
                            case (byte) 10:
                                readInt2 = dataInputStream.readInt();
                                byte[] bArr2 = new byte[readInt2];
                                i2 = 0;
                                while (i2 < readInt2) {
                                    int read = dataInputStream.read(bArr2, i2, readInt2 - i2);
                                    if (read != -1) {
                                        i2 += read;
                                    } else {
                                        throw new IOException("Unexpected end of stream");
                                    }
                                }
                                this.a.put(readUTF, bArr2);
                                break;
                            case (byte) 11:
                                this.a.put(readUTF, Double.valueOf(dataInputStream.readDouble()));
                                break;
                            default:
                                StringBuilder stringBuilder = new StringBuilder(40);
                                stringBuilder.append("Couldn't read extra of type: ");
                                stringBuilder.append(readByte);
                                throw new RuntimeException(stringBuilder.toString());
                        }
                    }
                    dataInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                }
            }
        }
    }

    public final void a(String str, boolean z) {
        synchronized (this.a) {
            this.a.put(str, Boolean.valueOf(z));
        }
    }

    public final boolean b(String str, boolean z) {
        return this.a.containsKey(str) ? ((Boolean) this.a.get(str)).booleanValue() : z;
    }

    public final void a(String str, int i) {
        synchronized (this.a) {
            this.a.put(str, Integer.valueOf(i));
        }
    }

    public final int b(String str, int i) {
        return this.a.containsKey(str) ? ((Integer) this.a.get(str)).intValue() : i;
    }

    public final void a(String str, long j) {
        synchronized (this.a) {
            this.a.put(str, Long.valueOf(j));
        }
    }

    public final long a(String str) {
        return b(str, 0);
    }

    public final long b(String str, long j) {
        return this.a.containsKey(str) ? ((Long) this.a.get(str)).longValue() : j;
    }

    public final void a(String str, String str2) {
        synchronized (this.a) {
            this.a.put(str, str2);
        }
    }

    public final String b(String str) {
        return this.a.containsKey(str) ? (String) this.a.get(str) : null;
    }

    public final byte[] a() {
        byte[] toByteArray;
        synchronized (this.a) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(this.a.size());
                for (Entry entry : this.a.entrySet()) {
                    dataOutputStream.writeUTF((String) entry.getKey());
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        dataOutputStream.writeByte(1);
                        dataOutputStream.writeUTF((String) value);
                    } else {
                        int i = 0;
                        if (value instanceof String[]) {
                            dataOutputStream.writeByte(2);
                            String[] strArr = (String[]) value;
                            dataOutputStream.writeInt(strArr.length);
                            while (i < strArr.length) {
                                dataOutputStream.writeUTF(strArr[i]);
                                i++;
                            }
                        } else if (value instanceof Long) {
                            dataOutputStream.writeByte(3);
                            dataOutputStream.writeLong(((Long) value).longValue());
                        } else if (value instanceof long[]) {
                            dataOutputStream.writeByte(4);
                            long[] jArr = (long[]) value;
                            dataOutputStream.writeInt(jArr.length);
                            while (i < jArr.length) {
                                dataOutputStream.writeLong(jArr[i]);
                                i++;
                            }
                        } else if (value instanceof Integer) {
                            dataOutputStream.writeByte(5);
                            dataOutputStream.writeInt(((Integer) value).intValue());
                        } else if (value instanceof int[]) {
                            dataOutputStream.writeByte(6);
                            int[] iArr = (int[]) value;
                            dataOutputStream.writeInt(iArr.length);
                            while (i < iArr.length) {
                                dataOutputStream.writeInt(iArr[i]);
                                i++;
                            }
                        } else if (value instanceof Boolean) {
                            dataOutputStream.writeByte(7);
                            dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                        } else if (value instanceof boolean[]) {
                            dataOutputStream.writeByte(8);
                            boolean[] zArr = (boolean[]) value;
                            dataOutputStream.writeInt(zArr.length);
                            while (i < zArr.length) {
                                dataOutputStream.writeBoolean(zArr[i]);
                                i++;
                            }
                        } else if (value instanceof Byte) {
                            dataOutputStream.writeByte(9);
                            dataOutputStream.writeByte(((Byte) value).byteValue());
                        } else if (value instanceof byte[]) {
                            dataOutputStream.writeByte(10);
                            byte[] bArr = (byte[]) value;
                            dataOutputStream.writeInt(bArr.length);
                            dataOutputStream.write(bArr);
                        } else if (value instanceof Double) {
                            dataOutputStream.writeByte(11);
                            dataOutputStream.writeDouble(((Double) value).doubleValue());
                        }
                    }
                }
                dataOutputStream.flush();
                byteArrayOutputStream.flush();
                toByteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
            }
        }
        return toByteArray;
    }
}
