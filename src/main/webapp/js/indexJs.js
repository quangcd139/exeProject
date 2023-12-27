
function toggleCharacterList(buttonNumber) {
    var characterList = document.getElementById("characterList");
    var frame = document.getElementById("frame");
    if (frame.style.display === "none") {
        handleDisplayData(buttonNumber);
        frame.style.display = "block";
    } else {
        clearCharacterListData();
        frame.style.display = "none";
    }
}
function clearCharacterListData() {
    var characterList = document.getElementById("characterList");
    characterList.innerHTML = "";
}
var list=[];
var xhr = new XMLHttpRequest();
xhr.open('GET', 'https://jsonplaceholder.typicode.com/photos', true);
xhr.setRequestHeader('Content-Type', 'application/json');

xhr.onload = function() {
  if (xhr.status === 200) {
    var responseData = JSON.parse(xhr.responseText);
    list = responseData.slice(0, 30); 
    console.log(list);
  } else {
    console.log('Request failed. Status:', xhr.status);
  }
};
xhr.onerror = function() {
  console.log('Request failed. Network error.');
};
xhr.send();


var parsedList = list;
function handleDisplayData(clickNumber) {

    // var jsonList = JSON.stringify(list);
    // var parsedList = JSON.parse(jsonList);
    // parsedList = list;
    var characterListDiv = document.getElementById("characterList");
    characterListDiv.classList.add("overflow-auto");
    var divChild = document.createElement('div');
    divChild.style.display = 'grid';
    divChild.style.gridTemplateColumns = 'repeat(6, 1fr)';
    divChild.style.gap = '10px';
    characterListDiv.appendChild(divChild);
    list.forEach(function (item) {
        var divTag = document.createElement('div');
        divTag.style.width = "80%";
        divTag.style.height = "50%";
        divTag.style.margin = "5px";
        divTag.style.cursor = "pointer"; // Set cursor style to indicate it's clickable

        var name = item.name;
        var nameTag = document.createElement('label');
        nameTag.innerText = name;

        var imgLink = item.url;
        var imgTag = document.createElement('img');
        imgTag.style.width = "100%";
        imgTag.style.height = "100%";
        imgTag.src = imgLink;

        const divTagClick = function () {
            handleChooseImage(item.id, imgLink, name, clickNumber);
        };

        // Add event listener to divTag
        divTag.addEventListener('click', divTagClick);

        divChild.appendChild(divTag);
        divTag.appendChild(imgTag);
        divTag.appendChild(nameTag);
    });
}


function handleChooseImage(id, img, name, clickNumber) {
    clearCharacterListData();
    const inputId = document.getElementById('id' + clickNumber);
    var imgTag = document.getElementById('img' + clickNumber);

    if (imgTag.src !== null) {
        var idBack = inputId.value;
        var foundItem = parsedList.find(item => item.id === idBack);
        if (foundItem) {
            list = [...list, foundItem];
        }
    }
    list = list.filter(item => item.id !== id);

    inputId.value = id;

    imgTag.src = img;
    imgTag.style.width = "100%";
    imgTag.style.height = "246px";
    document.getElementById('frame').style.display = 'none';
}

function handleImageClick(clickNumber) {
    const overlayElement = document.getElementById("frame");
    overlayElement.style.display = "block";
    document.getElementById("characterList").classList.remove("overflow-auto");
    // Tạo form element
    var form = document.createElement('form');
    form.className = 'row'; // Đặt class của form

    // Tạo div element cho cột 1
    var div1 = document.createElement('div');
    div1.className = 'col-md-4';

    // Tạo div element cho cột 2
    var div2 = document.createElement('div');
    div2.className = 'col-md-4';

    // Tạo div element cho cột 3
    var div3 = document.createElement('div');
    div3.className = 'col-md-4';

    // Tạo select element và label cho "Chọn nón ánh sáng"
    var selectLabel = document.createElement('label');
    selectLabel.textContent = 'Chọn nón ánh sáng:';
    var select = document.createElement('select');
    select.className = 'form-control';
    select.id = 'nas';
    // Tạo option và thêm vào select element
    var option1 = document.createElement('option');
    option1.value = '1';
    option1.textContent = 'Option 1';
    var option2 = document.createElement('option');
    option2.value = '2';
    option2.textContent = 'Option 2';
    select.appendChild(option1);
    select.appendChild(option2);
    // Thêm label và select vào div1
    div1.appendChild(selectLabel);
    div1.appendChild(select);

    // Tạo input element và label cho "Nhập HP"
    var hpLabel = document.createElement('label');
    hpLabel.textContent = 'Nhập HP:';
    var hpInput = document.createElement('input');
    hpInput.type = 'text';
    hpInput.className = 'form-control';
    // hpInput.style.
    // Thêm label và input vào div1
    div1.appendChild(hpLabel);
    div1.appendChild(hpInput);

    // Tạo input element và label cho "Nhập DEF"
    var defLabel = document.createElement('label');
    defLabel.textContent = 'Nhập DEF:';
    var defInput = document.createElement('input');
    defInput.type = 'text';
    defInput.className = 'form-control';
    // Thêm label và input vào div1
    div1.appendChild(defLabel);
    div1.appendChild(defInput);

    // Tạo button element
    var submitButton = document.createElement('button');
    submitButton.type = 'submit';
    submitButton.className = 'btn btn-primary';
    submitButton.textContent = 'Submit';
    // Tạo div element cho button
    var buttonDiv = document.createElement('div');
    buttonDiv.className = 'form-group';
    // Thêm button vào buttonDiv
    buttonDiv.appendChild(submitButton);
    // Thêm buttonDiv vào div1
    div1.appendChild(buttonDiv);

    // Tạo input element và label cho "Nhập sát thương"
    var dmgLabel = document.createElement('label');
    dmgLabel.textContent = 'Nhập sát thương:';
    var dmgInput = document.createElement('input');
    dmgInput.type = 'text';
    dmgInput.className = 'form-control';
    // Thêm label và input vào div2
    div2.appendChild(dmgLabel);
    div2.appendChild(dmgInput);

    // Tạo input element và label cho "Nhập crit dame"
    var critLabel = document.createElement('label');
    critLabel.textContent = 'Nhập crit dame:';
    var critInput = document.createElement('input');
    critInput.type = 'text';
    critInput.className = 'form-control';
    // Thêm label và input vào div2
    div2.appendChild(critLabel);
    div2.appendChild(critInput);

    // Tạo input element và label cho "Nhập sát thương nguyên số"
    var rawDmgLabel = document.createElement('label');
    rawDmgLabel.textContent = 'Nhập sát thương nguyên số:';
    var rawDmgInput = document.createElement('input');
    rawDmgInput.type = 'text';
    rawDmgInput.className = 'form-control';
    // Thêm label và input vào div2
    div2.appendChild(rawDmgLabel);
    div2.appendChild(rawDmgInput);

    //div3 add image
    var img = document.createElement('img');
    img.src = document.getElementById('img' + clickNumber).src;
    img.style.height = "300px";
    img.style.width = "80%";

    div3.appendChild(img);

    // Thêm div1 và div2 vào form
    form.appendChild(div1);
    form.appendChild(div2);
    form.appendChild(div3);

    // Thêm form vào body hoặc một phần tử khác trong DOM
    document.getElementById('characterList').appendChild(form);
}
