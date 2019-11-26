package defpackage;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.zip.ZipException;

/* renamed from: agpg */
public final class agpg implements agmm {
    private final File a;
    private agpf b;

    public agpg(File file) {
        this.a = file;
    }

    public final boolean a() {
        if (this.b != null) {
            return true;
        }
        try {
            this.b = new agpf(new ammp(this.a));
            return true;
        } catch (IOException e) {
            throw new agml(e);
        }
    }

    public final void close() {
        agpf agpf = this.b;
        if (agpf != null) {
            ammp ammp = agpf.a;
            if (ammp != null) {
                try {
                    ammp.close();
                    this.b = null;
                } catch (IOException e) {
                    throw new agml(e);
                } catch (Throwable th) {
                    this.b = null;
                }
            }
        }
    }

    public final amul b() {
        RuntimeException a;
        ammp ammp = c().a;
        try {
            anbe a2 = anbe.a();
            try {
                azlg azlg = (azlg) anxl.parseFrom(azlg.d, anaz.a((InputStream) a2.a(agpg.a("meta/streams.meta", ammp))), anxa.c());
                a2.close();
                if (azlg != null) {
                    agpf c = c();
                    try {
                        anbe a3 = anbe.a();
                        try {
                            azky azky = (azky) anxl.parseFrom(azky.b, anaz.a((InputStream) a3.a(agpg.a("meta/encryption.meta", c.a))), anxa.c());
                            a3.close();
                            if (azky != null) {
                                HashMap hashMap = new HashMap();
                                for (azla azla : azky.a) {
                                    String str = azla.b;
                                    Object obj = azla.c;
                                    if (obj == null) {
                                        obj = azkw.a;
                                    }
                                    hashMap.put(str, obj);
                                }
                                amuo a4 = amul.a(azlg.c.size());
                                for (arlv arlv : azlg.c) {
                                    String str2 = azlg.b;
                                    int i = arlv.c;
                                    a4.c(agnn.a(ahdh.a(azlg.b, arlv), arlv, amqp.c((azkw) hashMap.get(new Formatter(Locale.US).format("streams/%s-%d.stream", new Object[]{str2, Integer.valueOf(i)}).toString())), Collections.emptyList()));
                                }
                                return a4.a();
                            }
                            throw new agml("FileFormatEncryptionMetadata failed to parse from input stream");
                        } catch (Throwable th) {
                            a3.close();
                        }
                    } catch (IOException th2) {
                        throw new agml(th2);
                    }
                }
                throw new agml("FileFormatStreamsMetadata failed to parse from input stream");
            } catch (Throwable th3) {
                a2.close();
            }
        } catch (IOException th22) {
            throw new agml(th22);
        }
    }

    private static InputStream a(String str, ammp ammp) {
        ammq a = ammp.a(str);
        String str2;
        if (a == null) {
            str = String.valueOf(str);
            str2 = "File not found at path: ";
            throw new FileNotFoundException(str.length() == 0 ? new String(str2) : str2.concat(str));
        }
        InputStream ammr;
        a = ammp.a(a.a);
        if (a != null) {
            int i = a.d;
            if (i == 0) {
                RandomAccessFile randomAccessFile = ammp.a;
                synchronized (randomAccessFile) {
                    ammr = new ammr(randomAccessFile, a.f);
                    DataInputStream dataInputStream = new DataInputStream(ammr);
                    int reverseBytes = Integer.reverseBytes(dataInputStream.readInt());
                    if (((long) reverseBytes) != 67324752) {
                        ammp.a("Local File Header", reverseBytes);
                    }
                    dataInputStream.skipBytes(2);
                    char reverseBytes2 = (char) Short.reverseBytes(dataInputStream.readShort());
                    if ((reverseBytes2 & 1) == 0) {
                        dataInputStream.skipBytes(18);
                        reverseBytes2 = (char) Short.reverseBytes(dataInputStream.readShort());
                        char reverseBytes3 = (char) Short.reverseBytes(dataInputStream.readShort());
                        dataInputStream.close();
                        ammr.skip((long) (reverseBytes2 + reverseBytes3));
                        ammr.a = ammr.b + a.c;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder(45);
                        stringBuilder.append("Invalid General Purpose Bit Flag: ");
                        stringBuilder.append(reverseBytes2);
                        throw new ZipException(stringBuilder.toString());
                    }
                }
            }
            StringBuilder stringBuilder2 = new StringBuilder(43);
            stringBuilder2.append("Unsupported compression method: ");
            stringBuilder2.append(i);
            throw new ZipException(stringBuilder2.toString());
        }
        ammr = null;
        if (ammr != null) {
            return ammr;
        }
        str = String.valueOf(str);
        str2 = "Null stream found at entry path: ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new FileNotFoundException(str);
    }

    private final agpf c() {
        agpf agpf = this.b;
        if (agpf != null) {
            return agpf;
        }
        throw new IllegalStateException("YTB file is not open.");
    }
}
