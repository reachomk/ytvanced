package defpackage;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: raq */
public final class raq implements qut {
    private static final byte[] a = new byte[0];
    private final ras b;
    private final String c;
    private final byte[] d;
    private final rao e;
    private final int f;

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        ras ras = this.b;
        String str = this.c;
        byte[] bArr3 = this.d;
        int a = this.e.a();
        int i = this.f;
        KeyPair a2 = rau.a(ras.a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) a2.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) a2.getPrivate();
        ECPublicKey eCPublicKey2 = ras.a;
        try {
            ECParameterSpec params = eCPublicKey2.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (params.getCurve().equals(params2.getCurve()) && params.getGenerator().equals(params2.getGenerator()) && params.getOrder().equals(params2.getOrder()) && params.getCofactor() == params2.getCofactor()) {
                ECPoint w = eCPublicKey2.getW();
                rau.a(w, eCPrivateKey.getParams().getCurve());
                params = eCPrivateKey.getParams();
                params.getCurve();
                PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(w, params));
                KeyAgreement keyAgreement = (KeyAgreement) ray.c.a("ECDH");
                keyAgreement.init(eCPrivateKey);
                try {
                    keyAgreement.doPhase(generatePublic, true);
                    byte[] generateSecret = keyAgreement.generateSecret();
                    EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                    BigInteger bigInteger = new BigInteger(1, generateSecret);
                    if (bigInteger.signum() == -1 || bigInteger.compareTo(rau.a(curve)) != -1) {
                        throw new GeneralSecurityException("shared secret is out of range");
                    }
                    BigInteger a3 = rau.a(curve);
                    BigInteger mod = bigInteger.multiply(bigInteger).add(curve.getA()).multiply(bigInteger).add(curve.getB()).mod(a3);
                    if (a3.signum() == 1) {
                        BigInteger bigInteger2;
                        mod = mod.mod(a3);
                        if (mod.equals(BigInteger.ZERO)) {
                            bigInteger2 = BigInteger.ZERO;
                        } else {
                            if (!a3.testBit(0) || !a3.testBit(1)) {
                                if (a3.testBit(0) && !a3.testBit(1)) {
                                    bigInteger = BigInteger.ONE;
                                    BigInteger shiftRight = a3.subtract(BigInteger.ONE).shiftRight(1);
                                    int i2 = 0;
                                    while (true) {
                                        BigInteger mod2 = bigInteger.multiply(bigInteger).subtract(mod).mod(a3);
                                        if (mod2.equals(BigInteger.ZERO)) {
                                            bigInteger2 = bigInteger;
                                            break;
                                        }
                                        BigInteger modPow = mod2.modPow(shiftRight, a3);
                                        if (modPow.add(BigInteger.ONE).equals(a3)) {
                                            modPow = a3.add(BigInteger.ONE).shiftRight(1);
                                            int bitLength = modPow.bitLength() - 2;
                                            BigInteger bigInteger3 = BigInteger.ONE;
                                            bigInteger2 = bigInteger;
                                            while (bitLength >= 0) {
                                                BigInteger bigInteger4;
                                                BigInteger multiply = bigInteger2.multiply(bigInteger3);
                                                bigInteger2 = bigInteger2.multiply(bigInteger2).add(bigInteger3.multiply(bigInteger3).mod(a3).multiply(mod2)).mod(a3);
                                                multiply = multiply.add(multiply).mod(a3);
                                                if (modPow.testBit(bitLength)) {
                                                    bigInteger4 = modPow;
                                                    modPow = bigInteger2.multiply(bigInteger).add(multiply.multiply(mod2)).mod(a3);
                                                    bigInteger3 = bigInteger.multiply(multiply).add(bigInteger2).mod(a3);
                                                    bigInteger2 = modPow;
                                                } else {
                                                    bigInteger4 = modPow;
                                                    bigInteger3 = multiply;
                                                }
                                                bitLength--;
                                                modPow = bigInteger4;
                                            }
                                        } else {
                                            String str2 = "p is not prime";
                                            if (modPow.equals(BigInteger.ONE)) {
                                                bigInteger = bigInteger.add(BigInteger.ONE);
                                                i2++;
                                                if (i2 == 128) {
                                                    if (!a3.isProbablePrime(80)) {
                                                        throw new InvalidAlgorithmParameterException(str2);
                                                    }
                                                }
                                            } else {
                                                throw new InvalidAlgorithmParameterException(str2);
                                            }
                                        }
                                    }
                                }
                                bigInteger2 = null;
                            } else {
                                bigInteger2 = mod.modPow(a3.add(BigInteger.ONE).shiftRight(2), a3);
                            }
                            if (bigInteger2 != null) {
                                if (bigInteger2.multiply(bigInteger2).mod(a3).compareTo(mod) != 0) {
                                    throw new GeneralSecurityException("Could not find a modular square root");
                                }
                            }
                        }
                        if (!bigInteger2.testBit(0)) {
                            a3.subtract(bigInteger2).mod(a3);
                        }
                        curve = eCPublicKey.getParams().getCurve();
                        ECPoint w2 = eCPublicKey.getW();
                        rau.a(w2, curve);
                        int bitLength2 = (rau.a(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
                        int i3 = i - 1;
                        int[] iArr = rat.a;
                        if (i != 0) {
                            int i4;
                            byte[] bArr4;
                            byte[] bArr5;
                            i3 = iArr[i3];
                            if (i3 == 1) {
                                i4 = 0;
                                i3 = 1;
                                i = (bitLength2 + bitLength2) + 1;
                                bArr4 = new byte[i];
                                byte[] toByteArray = w2.getAffineX().toByteArray();
                                byte[] toByteArray2 = w2.getAffineY().toByteArray();
                                int length = toByteArray2.length;
                                System.arraycopy(toByteArray2, 0, bArr4, i - length, length);
                                i = toByteArray.length;
                                System.arraycopy(toByteArray, 0, bArr4, (bitLength2 + 1) - i, i);
                                bArr4[0] = (byte) 4;
                                bArr5 = bArr4;
                                bitLength2 = 2;
                            } else if (i3 != 2) {
                                str = i != 1 ? i != 2 ? "null" : "COMPRESSED" : "UNCOMPRESSED";
                                StringBuilder stringBuilder = new StringBuilder(str.length() + 15);
                                stringBuilder.append("invalid format:");
                                stringBuilder.append(str);
                                throw new GeneralSecurityException(stringBuilder.toString());
                            } else {
                                bitLength2++;
                                bArr5 = new byte[bitLength2];
                                byte[] toByteArray3 = w2.getAffineX().toByteArray();
                                int length2 = toByteArray3.length;
                                i4 = 0;
                                System.arraycopy(toByteArray3, 0, bArr5, bitLength2 - length2, length2);
                                bArr5[0] = !w2.getAffineY().testBit(0) ? (byte) 2 : (byte) 3;
                                bitLength2 = 2;
                                i3 = 1;
                            }
                            byte[][] bArr6 = new byte[bitLength2][];
                            bArr6[i4] = bArr5;
                            bArr6[i3] = generateSecret;
                            generateSecret = raj.a(bArr6);
                            Mac mac = (Mac) ray.b.a(str);
                            if (a <= mac.getMacLength() * 255) {
                                byte[] bArr7;
                                if (bArr3 == null || bArr3.length == 0) {
                                    mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
                                } else {
                                    mac.init(new SecretKeySpec(bArr3, str));
                                }
                                bArr3 = new byte[a];
                                mac.init(new SecretKeySpec(mac.doFinal(generateSecret), str));
                                byte[] bArr8 = new byte[0];
                                int i5 = 0;
                                while (true) {
                                    mac.update(bArr8);
                                    mac.update(bArr2);
                                    mac.update((byte) i3);
                                    bArr4 = mac.doFinal();
                                    i4 = bArr4.length;
                                    int i6 = i5 + i4;
                                    if (i6 >= a) {
                                        break;
                                    }
                                    bArr7 = bArr;
                                    System.arraycopy(bArr4, 0, bArr3, i5, i4);
                                    i3++;
                                    bArr8 = bArr4;
                                    i5 = i6;
                                }
                                System.arraycopy(bArr4, 0, bArr3, i5, a - i5);
                                rar rar = new rar(bArr5, bArr3);
                                rao rao = this.e;
                                rbf rbf = rar.b;
                                bArr8 = rao.a(rbf != null ? rbf.a() : null).a(bArr, a);
                                rbf rbf2 = rar.a;
                                bArr7 = rbf2 != null ? rbf2.a() : null;
                                return ByteBuffer.allocate(bArr7.length + bArr8.length).put(bArr7).put(bArr8).array();
                            }
                            throw new GeneralSecurityException("size too large");
                        }
                        throw null;
                    }
                    throw new InvalidAlgorithmParameterException("p must be positive");
                } catch (IllegalStateException e) {
                    throw new GeneralSecurityException(e.toString());
                }
            }
            throw new GeneralSecurityException("invalid public key spec");
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2.toString());
        }
    }

    public raq(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, rao rao) {
        rau.a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.b = new ras(eCPublicKey);
        this.d = bArr;
        this.c = str;
        this.f = i;
        this.e = rao;
    }
}
