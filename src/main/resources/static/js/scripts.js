function addRequest(form) {
    const payload = {
        method: 'POST',
        headers: {
            'Content-type': 'application/json'
        },
        body: JSON.stringify({author: form.author.value, message: form.message.value})
    };
    fetch('http://localhost:8080/notice', payload);
    location.reload();
    return false;
}

function delRequest(id) {
    fetch('http://localhost:8080/notice?id='+id, {method: 'DELETE'});
    location.reload();
    return false;
}