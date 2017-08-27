package jtonic.tmp.springbootkt.miscs

import java.io.IOException
import java.net.URL
import java.net.URLConnection
import java.net.URLStreamHandler
import java.net.URLStreamHandlerFactory

class MobileUrlStreamHandlerFactory(private val delegate: URLStreamHandlerFactory? = null) : URLStreamHandlerFactory {

    override fun createURLStreamHandler(protocol: String): URLStreamHandler? {
        if (protocol !in listOf("file", "ftp", "ftps", "http", "https")) {
            return DummyURLStreamHandler() // only for validation, doesn't handle openConnection
        }
        // It is not the mobile protocol so we delegate it to the wrapped
        // URLStreamHandlerFactory
        return delegate?.createURLStreamHandler(protocol)
    }

    class DummyURLStreamHandler : URLStreamHandler() {

        @Throws(IOException::class)
        override fun openConnection(url: URL): URLConnection {
            throw UnsupportedOperationException()
        }
    }
}