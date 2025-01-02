def call(Map config = [:]) {
    emailext(
        subject: config.subject ?: "Pipeline Status: ${env.BUILD_NUMBER}",
        body: config.body ?: '''<html>
                                    <body>
                                        <p>Build Status: ${env.BUILD_STATUS}</p>
                                        <p>Build Number: ${env.BUILD_NUMBER}</p>
                                        <p>Check the <a href="${env.BUILD_URL}">console output</a>.</p>
                                    </body>
                                 </html>''',
        to: config.to ?: 'default@example.com',
        from: config.from ?: 'jenkins@example.com',
        replyTo: config.replyTo ?: 'jenkins@example.com',
        mimeType: config.mimeType ?: 'text/html'
    )
}
