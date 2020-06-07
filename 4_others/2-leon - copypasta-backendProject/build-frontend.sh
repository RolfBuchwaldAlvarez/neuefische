# build client / frontend
cd client || exit
npm install
npm run build

cd ..
mkdir backend/src/main/resources/static
cp -R client/build/ backend/src/main/resources/static
