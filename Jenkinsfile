node {
    checkout scm

    docker.withRegistry('https://registry.hub.docker.com/', 'docker_hub') {

        def customImage = docker.build("my-image:${env.BUILD_ID}")

        /* Push the container to the custom Registry */
        customImage.push()
    }
}